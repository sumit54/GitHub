class MyException:
    def __init__(self,a,b):
        self.a=a;
        self.b=b;
        ##super(Exception,self).__init__("Number Error");

    def divisionOfNumbers(self):
        try:
            total=self.a/self.b;
            print(total);
        except Exception:
            print("b should not be 0");

myException=MyException(15,0);
myException.divisionOfNumbers();
        
    
