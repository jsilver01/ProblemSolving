T = int(input())

for i in range(T):
    floor = int(input())
    room = int(input())
    people = [ i for i in range(1,room+1)]
    
    for x in range(floor):
        new = []
        for y in range(room):
            new.append(sum(people[:y+1]))
        people = new.copy()
    
    print(people[-1])
