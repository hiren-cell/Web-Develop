#function use because the idea of
#code redundency dont repeat code
picture = [
  [0,0,0,1,0,0,0],
  [0,0,1,1,1,0,0],
  [0,1,1,1,1,1,0],
  [1,1,1,1,1,1,1],
  [0,0,0,1,0,0,0],
  [0,0,0,1,0,0,0],
  [1,1,1,1,1,1,1]
]

def show_tree():
    for image in picture:
        for pixel in image:
            #if block run when 1 come
            #when 0 come else run
            if (pixel):
                print('*', end ="")
            else:
                print(' ', end ="")
        print('')

show_tree()
print(show_tree)# it gives object location