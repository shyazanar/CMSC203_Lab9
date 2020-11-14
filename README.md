# CMSC203 Lab9 - Inheritance

## Objectives

+ Be able to derive a class from an existing class
+ Be able to define a class hierarchy in which methods are overridden and fields are hidden
+ Be able to use derived-class objects
+ Implement a copy constructor

## Introduction

In this lab, you will be creating new classes that are derived from a class called BankAccount. A checking account is a bank account and a savings account is a bank account as well. This sets up a relationship called inheritance, where BankAccount is the superclass and CheckingAccount and SavingsAccount are subclasses. This relationship allows CheckingAccount to inherit attributes from BankAccount (like owner, balance, and accountNumber, but it can have new attributes that are specific to a checking account, like a fee for clearing a check. It also allows CheckingAccount to inherit methods from BankAccount, like deposit, that are universal for all bank accounts. You will write a withdraw method in CheckingAccount that overrides the withdraw method in BankAccount, in order to do something slightly different than the original withdraw method. You will use an instance variable called accountNumber in SavingsAccount to hide the accountNumber variable inherited from BankAccount.  
