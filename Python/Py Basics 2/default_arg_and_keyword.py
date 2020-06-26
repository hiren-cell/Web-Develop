def say_hello(name, emoji):
    print('hellooooo {}{}'.format(name, emoji))

say_hello('dev ', 'happy')

#keyword argument
#usually it is a bad practice
say_hello(emoji='happy',name = 'dev ')

## default parameter
#some discussion
#http://stackoverflow.com/questions/24719368/syntaxerror-non-default-argument-follows-default-argument/39942121#:~:text=firstly%20non-default%20argument%20should,%2Cr%3D%22j%22)
def say_helloo(emoji, name = 'Dev '):
    print('hellooooo {}{}'.format(name, emoji))

say_helloo('happy')