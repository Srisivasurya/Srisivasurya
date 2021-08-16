/*private int _nextIndex = 0;

        Accounts[] arrayAccounts = new Accounts[19];


private void createAccountButton_Click(object sender, EventArgs e)
        {
        if (string.IsNullOrEmpty(accountIDTexTBox.Text)) return;
        var account = new Accounts();
        int accountID;
        int balance = 0;

        bool success = int.TryParse(accountIDTexTBox.Text, out accountID);


        if (!int.TryParse(amountTextBox.Text, out balance))
        {
        result.Text = "Invalid Format in the Amount Fields please correct";
        //   MessageBox.Show("Invalid Format in the Amount Fields please correct");
        }


        if (balance < 300)
        {
        label5.Text = ("initial deposit must be $300 or greater");
        }

        else if (success)
        {
        account.AccountId = accountID;
        account.Balance = balance;
        arrayAccounts[_nextIndex] = account;
        OutPutLabel.Text = "Account # " + accountID + " open with balance of " + balance;
        }


        else
        {
        result.Text = ("invalid AccountID entered, Please Correct");
        }
        }

private Accounts GetAccounts(int id)
        {

        return arrayAccounts.Where(x => x.AccountId == id).FirstOrDefault();
        }


private void DepositRadioButton_CheckedChanged(object sender, EventArgs e)
        {
        // if (string.IsNullOrEmpty(accountIDTexTBox.Text)) return;
        int amount = 0;
        int accountID;
        bool succcess1 = int.TryParse(accountIDTexTBox.Text, out accountID);
        bool success2 = int.TryParse(amountTextBox.Text, out amount);
        try
        {
        if (succcess1 && success2 && amount > 0)
        {
        var selectedAccount = GetAccounts(accountID);
        selectedAccount.Balance += amount;
        OutPutLabel.Text = "Account # " + accountID + " deposit " + amount;
        }
        else if (!succcess1)
        {
        result.Text = "You are attempting to deposit  to a non-number ID";
        }
        else if (!success2)
        {
        result.Text = "Youu are Attempting to deposit \n "+
        "to a non_Number amount  \n Please reenter the amount";
        }
        }
        catch(NullReferenceException)
        {
        result.Text = "Account has not being Created , \n Please create an Account";
        }

        }

private void WithdrawRadioButton_CheckedChanged(object sender, EventArgs e)
        {
        // if (string.IsNullOrEmpty(accountIDTexTBox.Text)) return;
        int amount = 0;
        int accountID;
        bool success1 = int.TryParse(accountIDTexTBox.Text, out accountID);

        bool success2 = int.TryParse(amountTextBox.Text, out amount);
        try
        {
        if (success1 && success2 && amount > 0)
        {
        var selectedAccount = GetAccounts(accountID);
        selectedAccount.Balance -= amount;
        OutPutLabel.Text = amount + " withdraw from account # " + accountID;
        }


        else if (!success1)
        {
        result.Text = "You are attempting to withdraw from a non-number ID";
        }
        else if (!success2)
        {
        result.Text = "Youu are Attempting to Withdraw \n " +
        "a non_Number amount  \n Please reenter the amount";
        }

        }
        catch (NullReferenceException)
        {
        result.Text = "Account has not being created , \n Please Create Account";

        }

        }

private void exceuteButton_Click(object sender, EventArgs e)
        {
        /// if (string.IsNullOrEmpty(accountIDTexTBox.Text)) return;
        }

private void balanceRadioButton_CheckedChanged(object sender, EventArgs e)
        {
        int amount = 0;
        int accountID;
        bool success1 = int.TryParse(accountIDTexTBox.Text, out accountID);
        try
        {
        if (success1)
        {
        var selectedAccount = GetAccounts(accountID);
        OutPutLabel.Text = "Account # " + accountID + " has a balance of " + selectedAccount.Balance;
        }
        }
        catch (NullReferenceException)
        {
        result.Text = "Account has not being Created"
        + "\n Please create account.";

        }
        }
        }

class NegativeNumberException : Exception
        {
private static string msg = "The Amount you enter is a negative number";
public NegativeNumberException() : base(msg)
        {
        }
        }*/