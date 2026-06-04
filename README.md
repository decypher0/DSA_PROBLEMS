# DSA Problems Workspace

A clean, structured repository for practicing Data Structures & Algorithms (DSA) in Java. The project is configured as a single module so that every problem file is a self-contained, independent program with its own `main` method, letting you run any solution individually without editing a main file.

---

## 📂 Project Structure

```
DSA_PROBLEMS/
├── .idea/                 # IntelliJ Project metadata
├── Arryas/                # Arrays problems
│   └── MissingNumber268.java
├── LinkedList/            # Linked List problems
│   ├── ListNode.java      # Shared node class for reuse
│   └── RemoveDuplicatesFromSortedList.java
├── LeetCode/
│   └── Math/              # Math & LeetCode-specific exercises
│       ├── PalindromeNumber.java
│       └── PlusOne.java
├── DSA_PROBLEMS.iml       # IntelliJ module configurations
└── .gitignore             # Git ignore patterns (ignores build outputs)
```

---

## ⚙️ Running the Problems

### Option 1: Using your IDE (Recommended)
Since the project is structured with standard package scopes and independent class definitions:
1. Open this repository in **IntelliJ IDEA** or **VS Code**.
2. Open any problem file (e.g., `MissingNumber268.java`).
3. Click the green **Play/Run** icon next to the class name or the `main` method.

### Option 2: Using the Command Line
You can compile and run files manually from the project root directory:

```powershell
# 1. Compile all Java files into the 'out' folder
javac -d out Arryas/*.java LinkedList/*.java LeetCode/Math/*.java

# 2. Run an individual file using its fully qualified class name
java -cp out Arryas.MissingNumber268
java -cp out LeetCode.Math.PlusOne
java -cp out LinkedList.RemoveDuplicatesFromSortedList
```

---

## 📝 How to Add a New Problem

Whenever you want to tackle a new problem, follow these simple rules to ensure your new files run independently and don't conflict with existing ones:

1. **Create the File**: Create a new `.java` file in the appropriate directory (e.g., `Arryas/TwoSum.java`). Make sure the filename is in **PascalCase** and has no spaces.
2. **Add Package Statement**: Declare the package at the top matching the folder name:
   ```java
   package Arryas;
   ```
3. **Name the Class After the File**: Avoid naming your class `Solution`. Instead, make it `public class <FileName>`:
   ```java
   public class TwoSum {
       public int[] twoSum(int[] nums, int target) {
           // Your algorithm code
       }
   }
   ```
4. **Add a `main` Runner**: Implement a `public static void main` method at the bottom to test your code locally:
   ```java
   public static void main(String[] args) {
       TwoSum solver = new TwoSum();
       int[] result = solver.twoSum(new int[]{2, 7, 11, 15}, 9);
       System.out.println(java.util.Arrays.toString(result)); // [0, 1]
   }
   ```
