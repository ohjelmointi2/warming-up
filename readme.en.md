# Course's warm up exercise

This repository contains a set of Java exercises that will help you review the content of the Programming 1 course and familiarize yourself with the technical implementation of the exercises for the advanced course. This repository covers three main topics:

1. Strings
2. Collections
3. Classes and Objects

In this file, you will find the assignments and instructions for testing your solutions. Detailed instructions on the functionality of each method and class can be found in the provided Java classes of the task template.

Exercise's each section have ready made [JUnit](https://junit.org/) unit test, which are located in the [src/test/java/](./src/test/java/) directory. You can run the tests either using your code editor's testing tool ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) or using the [Gradle tool](https://docs.gradle.org/current/userguide/java_testing.html). You don't need to get into the technical implementation of the tests. Right now, it is enough that you run the tests and familiarize yourself with the possible error messages.

Note, that you can't change the names of the classes or methods, or the types of the parameters or return values. These kind of changes will cause compilation errors for the tests. If you happen to change a file and want to revert the changes, you can do that using the `git restore` command:

```sh
git restore path/to/the/file
```

## Starting the exerices

Start by cloning the Git

Start by cloning the Git repository to your own computer. The exercise must be done in your own copy, so make sure that your GitHub username is included in the repository address! You can create your own copy through the GitHub classroom link provided in your course exercise.

```sh
git clone https://github.com/make-sure-that-the-repository-address-contains-your-account.git
```

Once you have cloned the repository, open it in your code editor.

## Submitting solutions

Once you have solved some or all of the tasks and committed your answers, submit the solutions for evaluation using the `git push` command. Git push will automatically trigger a GitHub Actions workflow that compiles and tests your solutions, providing a pass or fail result for each test.

Once the GitHub Actions has executed your code, you see the results in your GitHub repository's [Actions tab](../../actions/workflows/classroom.yml). It usually takes a few minutes for the assesment to be completed. 

By clicking on the latest *"GitHub Classroom Workflow"* execution from the link above, you will get detailed information about the task evaluation. At the bottom of the page, you can see the points you received. By clicking on the "Autograding" heading, you can view the steps performed during the evaluation and their results in more detail. You can find an illustrated guide on this topic in the GitHub documentation [View autograding results (github.com)](https://docs.github.com/en/education/manage-coursework-with-github-classroom/learn-with-github-classroom/view-autograding-results).

💡 *You can submit your solution for evaluation as many times as needed until the task deadline. However, make sure that the latest submission yields the best points, as only the most recent points will be valid.*

### Part 1: strings *(recap, 30 %)*

In the Java class [StringBasics](./src/main/java/part01/StringBasics.java), there are methods, some of which are incorrect and some are incomplete. In the first part of the task, you need to correct and complete these methods. Detailed descriptions of the correct functionality of each method can be found in the comments of each method. Do not change the names, parameters, or return types of the existing methods. Changes may cause issues with the automatic testing of the task.

You can write your own `main` method to test the methods or use the [JUnit](https://junit.org/) tests provided for the class, which you can find in the class [StringBasicsTest](./src/test/java/part01/StringBasicsTest.java).

You can run the tests either using your code editor's testing tool ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)) or using the [Gradle tool](https://docs.gradle.org/current/userguide/java_testing.html):

```
./gradlew test --tests StringBasicsTest        # unix
.\gradlew.bat test --tests StringBasicsTest    # windows
```

💡 *If the tests do not pass, try running the command again with the `--info` argument at the end. This will give you more detailed information about what went wrong in the test. Alternatively, you can run the tests using the testing tool in your code editor ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)), which typically displays errors clearly.*

💡 *You do not need to familiarize yourself with the technical implementation of the actual test. At this stage, it is sufficient to run the tests and review any error messages they may produce.*

### Part 2: collections *(recap, 30 %)*

In the second part of the task, you need to implement the methods in the [CollectionsBasics](./src/main/java/part02/CollectionsBasics.java) class. Detailed descriptions of the correct functionality of each method can be found in the comments of each method.

You can write your own `main` method to test the methods or use the [JUnit](https://junit.org/) tests provided for the class, which you can find in the [CollectionsBasicsTest](./src/test/java/part02/CollectionsBasicsTest.java) class. You can again run the tests using your code editor's testing tool or the Gradle automation tool:

```
./gradlew test --tests CollectionsBasicsTest        # unix
.\gradlew.bat test --tests CollectionsBasicsTest    # windows
```

🚀 *You will likely learn entirely new ways to implement these methods as the course progresses. You can revisit these methods later and consider how you would implement them, for example, using Streams.*

### Part 3: classes and objects *(recap, 20 + 20 %)*

In the third part of the task, you first need to complete two Java classes:

- [Person](./src/main/java/part03/Person.java) is a fairly simple Java class that models individuals with a name and age. The implementation of the class is incomplete, and you need to complete it according to the comments in the class and methods.
- The [ObjectExercise](./src/main/java/part03/ObjectExercise.java) class, on the other hand, contains a single method where you are supposed to handle `Person` objects and combine the names of individuals into a single string. You can find the detailed rules for combining names in the method's comments.

Testing your implementation is done in the same way as in the previous parts, using your own `main` method or the provided JUnit unit tests ([PersonTest.java](./src/test/java/part03/PersonTest.java), [ObjectExerciseTest.java](./src/test/java/part03/ObjectExerciseTest.java)). If you are using the Gradle tool, you can run the tests with the command:

```
# unix
./gradlew test --tests PersonTest
./gradlew test --tests ObjectExerciseTest

# windows
.\gradlew.bat test --tests PersonTest
.\gradlew.bat test --tests ObjectExerciseTest
```

## License and authors

This exercise is made by Teemu Havulinna and translated to English by Kalle Ilves and it is licensed under a [Creative Commons BY-NC-SA license](https://creativecommons.org/licenses/by-nc-sa/4.0/).

ChatGPT 3.5 language model and GitHub copilot AI assistant has been used to implement the exercise.
