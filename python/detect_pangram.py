
# A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence 
#"The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
# Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

def find_by_first(matrix, char):
    return next((row for row in matrix if row[0] == char), None)

def check_matrix_true(matrix):
    return all(row[1] for row in matrix)

def is_pangram(st):

    diccWords = [
        ['a', False], ['b', False], ['c', False], ['d', False], ['e', False], ['f', False], ['g', False],
        ['h', False], ['i', False], ['j', False], ['k', False], ['l', False], ['m', False], ['n', False],
        ['o', False], ['p', False], ['q', False], ['r', False], ['s', False], ['t', False], ['u', False],
        ['v', False], ['w', False], ['x', False], ['y', False], ['z', False]
    ]

    st = st.lower()

    for word in st:
        found = find_by_first(diccWords,word)
        if found:
            found[1] = True


    result = check_matrix_true(diccWords)

    return result


print(is_pangram("This isn't a pangram!"))