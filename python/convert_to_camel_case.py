import re

def to_camel_case(text):
    words = re.split('_|-', text)
    
    result=''

    for word in words:
        if word is words[0]:
            result = result + word
        else:
            result = result + word.capitalize()

    return result

print(to_camel_case('the_stealth_warrior'))