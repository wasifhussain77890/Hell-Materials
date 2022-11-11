import random

def main():
    number = random.randint(1, 100)

    while True:
        ans = input("Enter your guess:")

        if ans == number:
            print("Congratulations!!")
            break

        else if ans < number:
            print("MORE!!!!")
        
        else:
            print("Not that much!!!!")
    

if __name__ == "__main__":
    main()