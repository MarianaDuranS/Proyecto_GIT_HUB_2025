import threading

def my_function():
    print("Timer fired!")

t = threading.Timer(30.0, my_function)
t.start()

# You can cancel the timer before it fires:
# t.cancel()