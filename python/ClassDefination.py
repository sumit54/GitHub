class Car:
    def __init__(self,carName,gst):
        self.carName=carName;
        self.gst=gst;
        print("In Parent Constructor: "+carName)

    def __del__(self):
        print("Garbage collected"+self.name)

    def start(self):
        print("Car Start : "+self.carName)

    def price(self,cost):
        totalPrice=float(cost)+float(self.gst);
        print "Total Price: ", float(totalPrice)

class CarChild(Car):
     def __init__(self,name,gst):
        Car.__init__(self,name,gst)
        print("In Child Constructor: "+name)
      



carChild=CarChild("Audi",18.4)
carChild.start()
carChild.price(100000)



