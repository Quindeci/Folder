from OOP.LAB7 import DoubleList
from OOP.Lab6 import *

l = Microwave(200, 220, 130)
l1 = Microwave(350, 350, 500)
l2 = Microwave(150, 120, 1100)
l3 = Fridge(250, 450, 600)
r = Fridge(450, 800, 800)
r1 = Fridge(250, 700, 900)
r2 = Washer(125, 745, 1200)
t = Washer(300, 850, 290)
t1 = PC(900, 625, 500)
i = PC(1000, 800, 450)
i1 = PC(1200, 950, 500)
First_pack = DoubleList()
First_pack.addAll(l, l1, l2, l3, r, r1)
First_pack.list_sort(First_pack, "power")
First_pack.show(1)
Second_pack = DoubleList()
Third_pack = DoubleList()
Third_pack.addAll(i1, r2, l)
Third_pack.show(1)
Third_pack.remove(i1)
Third_pack.show(1)