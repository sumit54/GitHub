print("prime number Program")

number= int(input("Enter number: "))
m=0;
flag=0;
m=number/2;
i=2;

if(number==0 or number==1):
    print("Not Prime Number")

else:
    for i in range(i,m):
       if(number%i==0):
            print("Not Prime Number")
            flag=1;
            break;

if(flag==0):
    print("Prime Number")    



