# MyMatrix - Calculator
 A Matrix Calculator built using Java that is capable of performing FOUR main math operations on TWO Matrices
***
## Class and Method Explanations

1. MyMatrix Class:
MyMatrix is the most and the Main class of the Program. This class contains all the necessary
methods in order to perform the asked operations. The program creates two Objects of this Class named
matrix1 and matrix2 respectively, each containing the dimensions of its array[][] variable.

2. Constructor
The constructor will be invoked when the two named objects above, are created. The
constructor accepts 2 Integer variable named row and column, and also, 2-dimensional double type
array. Once all three of these parameters are received successfully, they will be passed to Setter
methods.

3. Setters: setRow, setColumn & setArray
As their names suggest, each of these methods will set the passed variables to the instance
variables of the class. All of these methods are void and private methods so that they can’t be accesses
unless they are called by its own class.
4. Setter: setElements
The setElements method is only used when the Constructor is invoked. Whenever the new
object created, the constructor will call this Setter method to get the elements of the Array of the created
object.

5. Getters: getElements, getDimension
These two methods are used to print the elements of the Array of the used object and the
Dimension of the array whenever they are called.

6. Operation Methods

- matrixAddition: This method is used to Add two Matrices. The method accepts
two objects of MyMatrix type as a parameter. Once the operation is Successful, the
method will print the newly created array, else, it will Print an Error Message.

- matrixSubtraction: This method is used to Subtract two Matrices. The method
accepts two objects of MyMatrix type as a parameter. Once the operation is
Successful, the method will print the newly created array, else, it will Print an Error
Message.

- matrixMultiplication: This method is used to Multiple two Matrices as its name
suggests. The method accepts two objects of MyMatrix type as a parameter. Once
the operation is Successful, the method will print the newly created array, else, it
will Print an error Message.

- matrixDivision: This method is used to Divide two Matrices. The method accepts
two objects of MyMatrix type as a parameter. In Theory the Division is not really a
division but rather Multiplication of one matrix with the Inverse of the second
matrix. So, what I did is, import the Matrix Library called JAMA and used its, det(),
determinant method, inverse(), inverse method and print(), Print method to get the
result. Once the operation is Successful, the method will print the newly created
array, else, it will Print an error Message.

- Main Class
7. Main Class obviously has the main method, also additional getArrayDimension and Public
Scanner object, input. main method is used to create an object by calling the MyMatrix and invoking
the Constructor. The passed parameters are instantiated in this main method. The getArrayDimension
method is used to get the Row and Column of the Object Array, later on which are passed to MyMatrix
class.
