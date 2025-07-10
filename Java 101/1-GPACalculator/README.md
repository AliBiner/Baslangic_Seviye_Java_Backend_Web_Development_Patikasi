# GPA Calculator (Console App)

This is a simple Java console application to calculate the average score of several lessons and check if the student passed or failed.

## 📚 Features

- Allows user to enter lesson scores using console.
- Validates user input (must be between 0 and 100).
- Calculates GPA (average score).
- Prints result as "Geçti" (Passed) or "Kaldı" (Failed).

## 🛠 Technologies

- Java
- Console Input (Scanner)
- OOP (Object-Oriented Programming)
- Exception Handling (try-catch)

## 🚀 How to Run

1. Make sure you have **Java JDK** installed.
2. Clone or download the project files.
3. Open terminal or command prompt.
4. Compile the code:
   ```bash
   javac *.java
   java GPA
   ```
## 🧠 How It Works

- The program creates a list of lessons (e.g. Math, Physics, etc.).
- It asks the user to enter scores for each lesson.
- If user enters invalid input (like a string instead of a number), it shows an error and asks again.
- After collecting all valid scores, it calculates the average.
- If the average is 60 or more, the result is "Geçti", otherwise "Kaldı".

## 📄 Example Output

```scss 
Matematik dersinin notunu giriniz(0-100): 
> 80.0
Hatalı giriş! Lütfen tam sayı giriniz.
Matematik dersinin notunu giriniz(0-100):
>80
Fizik dersinin notunu giriniz(0-100): 
> 500
Geçersiz bir not girdiniz. Lütfen 0-100 arasında bir değer giriniz: 
Fizik dersinin notunu giriniz(0-100): 
>50
Kimya dersinin notunu giriniz(0-100): 
> 60
Türkçe dersinin notunu giriniz(0-100): 
> 90
Tarih dersinin notunu giriniz(0-100): 
> 55
Müzik dersinin notunu giriniz(0-100): 
> 40
Geçti
```

## 🔁 Future Improvements

- Support for letter grades (A, B, C...).
- Saving data to a file or database.
- Adding weights to lessons.
- Support for multiple students.