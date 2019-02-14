# -*- coding: utf-8 -*-
"""
Created on Wed Feb 13 17:45:32 2019

@author: divya
"""
from random import randint
class Shape:
   def displayShape(self):
        raise NotImplementedError('subclasses must override displayShape()!')
        
class Circle(Shape):
    def __init__(self):
        self.__edges=0    
    def getvalue(self):
        return self.__edges    
    def displayShape(self):
         print("Circle")
         return
     
class Square(Shape):
    def __init__(self):
        self.__edges=4        
    def getvalue(self):
        return self.__edges    
    def displayShape(self):
         print("Square")
         return
     
class Triangle(Shape):
    def __init__(self):
        self.__edges=3
    def getvalue(self):
        return self.__edges    
    def displayShape(self):
         print("Triangle")
         return
           
if __name__ == '__main__':
    objCnt = int(input('Enter the number of objects: '))
    switcher={1:Circle(),2:Square(),3:Triangle()}
    objLst=[]     
    for i in range(objCnt):
        rnd=randint(1, 3)
        objLst.append(switcher[rnd]) 
    print('Before Sorting')
    for i in objLst:
        i.displayShape()
    ##Sorting
    objLst.sort(key=lambda x: x.getvalue())
    ##Displaying
    print('\nAfter Sorting')
    for i in objLst:
        i.displayShape()
        