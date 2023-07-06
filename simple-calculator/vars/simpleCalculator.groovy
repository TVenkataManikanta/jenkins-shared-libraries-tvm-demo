def call(num1, num2) {
    return "Welcome to the simple calculator powered by shared library. The two numbers entered are ${num1} and ${num2}"
}

def add(num1, num2) {
    return "The addition of the numbers ${num1} and ${num2} is ${num1.toInteger() + num2.toInteger()}"
}

def subtract(num1, num2) {
    return "The subtraction of the numbers ${num1} and ${num2} is ${num1.toInteger() - num2.toInteger()}"
}

def multiply(num1, num2) {
    return "The multiplication of the numbers ${num1} and ${num2} is ${num1.toInteger() * num2.toInteger()}"
}


def oddoreven(num1, num2) {
    if (num1.toInteger() % 2 == 0) {
        echo "Number 1 is Even"
    }
    else {
        echo "Number 1 is Odd"
    }

    if (num2.toInteger() % 2 == 0) {
        echo "Number 2 is Even"
    }
    else {
        echo "Number 2 is Odd"
    }    
}