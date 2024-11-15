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

💡 *Jos testit eivät mene läpi, kokeile suorittaa komento uudestaan siten, että lisäät loppuun argumentin `--info`. Näin saat tarkemman tiedon siitä, mikä testissä meni pieleen. Vaihtoehtoisesti voit suorittaa testit koodieditorin testaustyökalulla ([VS Code](https://code.visualstudio.com/docs/java/java-testing), [Eclipse](https://www.vogella.com/tutorials/JUnitEclipse/article.html)), joka tyypillisesti näyttää virheet selkeästi.*

💡 *Sinun ei tarvitse perehtyä varsinaisen testin tekniseen toteutukseen. Tässä vaiheessa riittää, että suoritat testit ja tutustut niiden mahdollisesti tuottamiin virheilmoituksiin.*


### Osa 2: kokoelmat *(kertaus, 30 %)*

Tehtävän toisessa osassa sinun tulee toteuttaa [CollectionsBasics](./src/main/java/part02/CollectionsBasics.java)-luokassa olevat metodit. Tarkemmat selostukset kunkin metodin oikeasta toiminnasta löydät kunkin metodin kommenteista.

Voit kirjoittaa metodien testaamiseksi oman `main`-metodin tai hyödyntää luokan testaamiseksi toteutettuja [JUnit](https://junit.org/)-testejä, jotka löydät luokasta [CollectionsBasicsTest](./src/test/java/part02/CollectionsBasicsTest.java). Voit jälleen suorittaa testit oman koodieditorisi testaustyökalulla tai Gradle-automaatiotyökalulla:

```
./gradlew test --tests CollectionsBasicsTest        # unix
.\gradlew.bat test --tests CollectionsBasicsTest    # windows
```

🚀 *Tulet todennäköisesti oppimaan kurssin edetessä aivan uusia tapoja näiden metodien toteuttamiseksi. Voit palata näihin metodeihin myöhemmin ja pohtia, miten toteuttaisit ne esimerkiksi Streamien avulla.*


### Osa 3: luokat ja oliot *(kertaus, 20 + 20 %)*

Tehtävän kolmannessa osassa sinun tulee ensin täydentää kahta Java-luokkaa:

* [Person](./src/main/java/part03/Person.java) on varsin yksinkertainen Java-luokka, joka mallintaa henkilöitä, joilla on nimi ja ikä. Luokan toteutus on kesken ja sinun tulee täydentää se toimivaksi luokan ja metodien kommenttien mukaisesti.
* [ObjectExercise](./src/main/java/part03/ObjectExercise.java)-luokka puolestaan sisältää yhden metodin, jossa sinun on tarkoitus käsitellä `Person`-olioita ja yhdistellä henkilöiden nimet yhdeksi merkkijonoksi. Tarkemmat säännöt nimien yhdistämiseksi löydät metodin kommenteista.

Oman toteutuksen testaaminen tapahtuu edellisistä osista tuttuun tapaan oman `main`-metodin tai valmiiden JUnit-yksikkötestien avulla ([PersonTest.java](./src/test/java/part03/PersonTest.java), [ObjectExerciseTest.java](./src/test/java/part03/ObjectExerciseTest.java)). Mikäli käytät Gradle-työkalua, voit suorittaa testit komennolla:

```
# unix
./gradlew test --tests PersonTest
./gradlew test --tests ObjectExerciseTest

# windows
.\gradlew.bat test --tests PersonTest
.\gradlew.bat test --tests ObjectExerciseTest
```


## Lisenssi ja tekijät

Tämän tehtävän on kehittänyt Teemu Havulinna ja se on lisensoitu [Creative Commons BY-NC-SA -lisenssillä](https://creativecommons.org/licenses/by-nc-sa/4.0/).

Tehtävänannon, lähdekoodien ja testien toteutuksessa on hyödynnetty ChatGPT 3.5 -kielimallia sekä GitHub copilot -tekoälyavustinta.
