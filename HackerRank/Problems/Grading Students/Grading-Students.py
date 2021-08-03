def gradingStudents(grades):
    result = []
    multiple = 0
    for mark in grades:
        if mark < 38:
            result.append(mark)
        else:
            multiple = mark + 2
            new = mark + 1
            if multiple % 5 == 0:
                result.append(multiple)
            elif new % 5 == 0:
                result.append(new)
            else:
                result.append(mark)
    return result

n = int(input("Number of Students: "))
grades = []
for _ in range(n):
    grades_item = int(input())
    grades.append(grades_item)

result = gradingStudents(grades)
print("\n".join(map(str, result)))
print("\n")

