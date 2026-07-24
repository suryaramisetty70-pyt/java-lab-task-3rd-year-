# 📚 Java Tasks - Array Index Access Tutorial

Welcome! This folder contains Java programs created to solve programming tasks and learn Java step-by-step.

---

## ❓ Question: Access and Print an Element at a Given Index in an Array

### 💡 What is an Array?
An **array** is like a row of lockers where each locker holds a piece of data (like numbers). 
Each locker has a position number called an **Index**.

> ⚠️ **IMPORTANT**: In Java (and most programming languages), index counting starts from **`0`**, NOT `1`!
>
> Example Array: `[10, 20, 30, 40, 50]`
> - Locker at index `0` ➡️ `10`
> - Locker at index `1` ➡️ `20`
> - Locker at index `2` ➡️ `30`
> - Locker at index `3` ➡️ `40`
> - Locker at index `4` ➡️ `50`

---

## 🛠️ Files in this Folder

1. 📄 **`ArrayIndexAccess.java`**: The main Java program that defines an array, accesses an element at a given index, prints it, and handles errors safely.
2. 🧪 **`ArrayIndexAccessTest.java`**: Automated test program to check if accessing valid and invalid indices works correctly.
3. 📖 **`README.md`**: This guide!

---

## 🚀 How to Run the Code on Your Computer

### Step 1: Open Terminal / Command Prompt
- On Windows: Press `Win + R`, type `powershell` or `cmd`, and press **Enter**.

### Step 2: Navigate to this Folder
```powershell
cd C:\Users\surya\.gemini\antigravity\scratch\java-tasks
```

### Step 3: Compile the Java Code
*Compilation translates human-readable Java code into bytecode (`.class` file) that your computer can execute.*
```powershell
javac ArrayIndexAccess.java
```

### Step 4: Run the Java Code
```powershell
java ArrayIndexAccess
```

### Step 5: Run the Test Code
```powershell
javac ArrayIndexAccessTest.java
java ArrayIndexAccessTest
```

---

## 🐙 How to Push to GitHub Step-by-Step

Follow these steps to put your tasks on GitHub:

1. **Create a GitHub Account** (if you don't have one):
   - Go to [https://github.com](https://github.com) and click **Sign up**.

2. **Create a New Repository on GitHub**:
   - Click the **`+`** icon at top-right on GitHub ➡️ Select **New repository**.
   - Name it: `java-learning-tasks`
   - Keep it **Public**.
   - Click **Create repository**.

3. **Link Local Folder & Push**:
   Open PowerShell in this folder and run:
   ```powershell
   git init
   git add .
   git commit -m "Add Java array index access task and tests"
   git branch -M main
   git remote add origin https://github.com/YOUR_USERNAME/java-learning-tasks.git
   git push -u origin main
   ```
