

#Bubbleing around

#Since everybody hates chaos and loves sorted lists we should implement some more sorting algorithms. 
# Your task is to implement a Bubble sort (for some help look at https://en.wikipedia.org/wiki/Bubble_sort) and return a list of snapshots after each change of the initial list.
#e.g.

#If the initial list would be l=[1,2,4,3] my algorithm rotates l[2] and l[3] and after that it adds [1,2,3,4] to the result, which is a list of snapshots.


def bubble(lst):

    sorted = False
    bubbleSort = []

    while(sorted == False):
        sorted = True
        for num in range(0, len(lst), 1):
            if(num + 1 < len(lst)):
                actualNumb = lst[num]
                nextNumber = lst[num + 1]
                if(actualNumb > nextNumber):
                    sorted = False
                    lst[num] = nextNumber
                    lst[num + 1] = actualNumb
                    bubbleSort.append(lst.copy())
    return bubbleSort

print(bubble([1,4,3,6,7,9,2,5,8]))