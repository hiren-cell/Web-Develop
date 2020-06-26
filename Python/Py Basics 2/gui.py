#Exercise!
#Display the image below to the 
# right hand side where the 
# 0 is going to be ' ', 
# and the 1 is going to be '*'.
# This will reveal an image!
picture = [
  [0,0,0,1,0,0,0],
  [0,0,1,1,1,0,0],
  [0,1,1,1,1,1,0],
  [1,1,1,1,1,1,1],
  [0,0,0,1,0,0,0],
  [0,0,0,1,0,0,0],
  [1,1,1,1,1,1,1]
]
for image in picture:
  for pixel in image:
      #if block run when 1 come
      #when 0 come else run
    if (pixel):
      print('*', end ="")
    else:
      print(' ', end ="")
  print('')