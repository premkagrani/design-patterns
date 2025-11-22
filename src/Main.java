
public static void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  System.out.println("Hello World");
}

/**
As a buy now pay later company, we want to implement a transaction feature to facilitate users' transactions on our platform.
User Story 1: Transaction Creation
User can initiate a purchase transaction.
User can specify purchase details, including items and purchase amount.
User will have the option to choose a repayment tenure for the transaction.
User Story 2: Transaction Approval
Users will receive a one-time password (OTP) for verification.
The system will apply predefined rules to evaluate user transactions.
        Upon approval, the system deducts the transaction amount from the available credit limit.
User Story 3: Transaction Settlement
The transaction is marked as settled when the amount is deducted from the credit limit.
Users receive a notification confirming the settlement.
A corresponding loan is automatically created for the settled amount.
 **/