import tkinter as tk

class Calculadora:
    def __init__(self,root):
        self.root= root
        self.root.title("Calculadora GUI")
        self.root.configure(bg='#2b3e50')

        self.pantalla = tk.Entry(self.root,width=50,bg='#3b4b5b', borderwidth=5,fg='white')
        self.pantalla.grid(row=0, column=0,padx=5,pady=10, columnspan=6)

        self.creacion_botones()

    def creacion_botones(self):
        botones = [
            ('MC', 1, 4), ('MR', 1, 5), ('M+', 2, 4), ('M-', 2, 5), ('MS', 3, 4),
            ('%', 3, 5), ('√', 4, 4), ('x²', 5, 5), ('1/x', 4, 5),
            ('CE', 1, 0), ('C', 1, 1), ('←', 1, 2), ('÷', 2, 3),
            ('7', 2, 0), ('8', 2, 1), ('9', 2, 2), ('x', 3, 3),
            ('4', 3, 0), ('5', 3, 1), ('6', 3, 2), ('-', 4, 3),
            ('1', 4, 0), ('2', 4, 1), ('3', 4, 2), ('+', 1, 3),
            ('±', 5, 0), ('0', 5, 1), ('.', 5, 2), ('=', 5, 3)
        ]

        for (text, row, col) in botones:
            button = tk.Button(self.root, text=text, padx=30, pady=30, bg='#4b5b6b', fg='white',
                               command=lambda t=text: self.boton_click(t))
            button.grid(row=row, column=col)

    def boton_click(self, valor):
        if valor == "=":
            try:
                result = str(eval(self.pantalla.get()))
                self.pantalla.delete(0, tk.END)
                self.pantalla.insert(0, result)
            except:
                self.pantalla.delete(0, tk.END)
                self.pantalla.insert(0, "Error")
        elif valor == "C" or valor == "CE":
            self.pantalla.delete(0, tk.END)
        elif valor == "←":
            current = self.pantalla.get()
            self.pantalla.delete(0, tk.END)
            self.pantalla.insert(0, current[:-1])
        elif valor == "±":
            try:
                current = float(self.pantalla.get())
                self.pantalla.delete(0, tk.END)
                self.pantalla.insert(0, str(-current))
            except:
                self.pantalla.delete(0, tk.END)
                self.pantalla.insert(0, "Error")
        elif valor == "√":
             try:
                current = float(self.pantalla.get())
                if current >= 0:
                    self.pantalla.delete(0, tk.END)
                    self.pantalla.insert(0, str(current**0.5))
                else:
                    self.pantalla.delete(0, tk.END)
                    self.pantalla.insert(0, "Error")
             except:
                self.pantalla.delete(0, tk.END)
                self.pantalla.insert(0, "Error")
        elif valor == "%":
            try:
                current = float(self.pantalla.get())
                self.pantalla.delete(0, tk.END)
                self.pantalla.insert(0, str(current/100))
            except:
                self.pantalla.delete(0, tk.END)
                self.pantalla.insert(0, "Error")
        elif valor == "1/x":
            try:
                current = float(self.pantalla.get())
                if current != 0:
                    self.pantalla.delete(0, tk.END)
                    self.pantalla.insert(0, str(1/current))
                else:
                     self.pantalla.delete(0, tk.END)
                     self.pantalla.insert(0, "Error")
            except:
                self.pantalla.delete(0, tk.END)
                self.pantalla.insert(0, "Error")
        elif valor == "x²":
            try:
                current = float(self.pantalla.get())
                self.pantalla.delete(0, tk.END)
                self.pantalla.insert(0, str(current**2))
            except:
                self.pantalla.delete(0, tk.END)
                self.pantalla.insert(0, "Error")
        else:
            current= self.pantalla.get()
            self.pantalla.delete(0, tk.END)
            self.pantalla.insert(0, current + valor)


root= tk.Tk()
calculadora= Calculadora(root)
root.mainloop()