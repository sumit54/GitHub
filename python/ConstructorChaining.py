class Animal:
  def __init__(self, animalName):
    print(animalName+ ' is an animal.');

class Mammal(Animal):
  def __init__(self, mammalName):
    print(mammalName+ ' is a warm-blooded animal.')
    Animal.__init__(self,mammalName)
    
class NonMarineMammal(Mammal):
  def __init__(self, NonMarineMammalName):
    print(NonMarineMammalName + " can't swim.")
    Mammal.__init__(self,NonMarineMammalName)

class Dog(NonMarineMammal):
  def __init__(self):
    print('Dog has 4 legs.');
    NonMarineMammal.__init__(self,"Dog")
    
    
d = Dog()

