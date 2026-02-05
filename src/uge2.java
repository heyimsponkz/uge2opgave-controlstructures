void main(){

    // BMI calculator

    double weight = 69.0;
    double height = 1.69;
    double bmi = weight / (height * height);

    System.out.println("Your BMI is " + String.format("%.2f", bmi));
    
    if (bmi >= 25) {
        System.out.println("You are fucking fat, fattie");
    } else if (bmi >= 18.5) {
        System.out.println("You are at normal weight, congrats");

    } else {
        System.out.println("You are skin and bones, eat some butter!");
    }

    // Time of day greeting

    int hour = 14;

    if (hour >= 5 && hour <= 11) {
        System.out.println("Good morning");
    } else if (hour >= 12 && hour <= 17) {
        System.out.println("Good afternoon");

    } else if (hour >= 18 && hour <= 21) {
        System.out.println("Good evening");
    } else {
        System.out.println("Good night homie");

    }

    // Movie Rating System

    int ageLimit = 15;
    int guestAge = 14;
    boolean hasParentalConsent = true;

    if (guestAge >= ageLimit ||  guestAge >= 13 && hasParentalConsent) {
        System.out.println("You're eligible to watch the movie");
    } else {
        System.out.println("Sorry kiddo, you're too young");
    }

    // Complete Access Control System

    boolean isAdmin = true;
    boolean accountActive = true;
    boolean isSuperUser = false;
    boolean isUser = false;
    boolean isBanned = false;
    boolean isGuest = false;
    boolean guestTime = false;

    String access;

    if (isAdmin && accountActive || isSuperUser) {
        access = "You are granted full access";
    } else if (isUser && accountActive && !isBanned || (isBanned && guestTime)) {
        access = "You are granted limited access";

    } else {
       access = "INTRUDER ALERT! ACCESS DENIED";
    }

    System.out.println("=== ACCESS CONTROL ===");
    System.out.println("Admin: " + isAdmin);
    System.out.println("Active: " + accountActive);
    System.out.println("Result: " + access);

    // ATM-transaction

    int balance = 5000;
    int amount = 1000;
    String operation = "withdraw";
    boolean txApproved = true;

    switch (operation) {
        case "withdraw":
            if (amount <= balance) {
                balance -= amount;
                System.out.println(amount + " $ has been withdrawn from your balance");
            } else {
                System.out.println("Lack of funds, please try again or contact your bank");
                txApproved = false;
            }
            break;

        case "deposit":
            balance += amount;
            System.out.println("A total of " + amount + " $ has been added to your balance");
            break;

        case "transfer":
            if (amount <= balance) {
                balance -= amount;
                System.out.println("A total of " + amount + " $ has been transferred from your account");
            } else {
                System.out.println("Lack of funds, please try again or contact your bank");
                txApproved = false;
            }
            break;

        default:
            System.out.println("Invalid input");
            txApproved = false;

    }
    if (txApproved && !operation.equals(balance)) {
        System.out.println("Your new balance is: " + balance + " $");
    }

    // Loan repayment

    int debt = 5000;
    int monthlyPayment = 200;
    int months = 0;

    while (debt > 0) {
        debt -= monthlyPayment;
        months++;
    }
    System.out.println("Loan is paid off in " + months + " months");

    // FizzBuzz

    for (int i = 1; i <= 30; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("Fizzbuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");

        } else if (i % 5 == 0) {
            System.out.println("Buzz");

        } else {
            System.out.println(i);
        }

    }

    // Grade statistics

    int[] scores = {85, 92, 78, 88, 95, 73, 90};

    int sum = 0;

    for (int score : scores) {
        sum += score;
    }
    double average = (double) sum / scores.length;
    System.out.println("The average score is: " + String.format("%.2f", average));

    int minScore =scores[0];
    int maxScore = scores[0];
    for (int i = 1; i < scores.length; i++) {
        if (scores[i] < minScore) minScore = scores[i];
        if (scores[i] > maxScore) maxScore = scores[i];
    }
    System.out.println("Minimum score: " + minScore);
    System.out.println("Maximum score: " + maxScore);

    int scoreAbove80 = 0;
    for (int i = 1; i < scores.length; i++) {
        if (scores[i] > 80) {
            scoreAbove80++;
        }
    }
    System.out.println("Scores above 80: " + scoreAbove80);


    // Shopping Cart Total

    double[] prices = {299.0, 149.0, 899.0, 49.0};

    int sumofPrices = 0;

    for (double price : prices) {
        sumofPrices += (int) price;
    }
    System.out.println("Sum of prices is: " + sumofPrices);

}