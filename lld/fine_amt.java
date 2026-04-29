public class fine_amt {
    private int return_date;
    private int due_date;

    public fine_amt(int return_date, int due_date) {
         this.return_date = return_date;
        this.due_date = due_date;
    }

    public int computeFine() {
        int days_overdue = return_date - due_date;

        if (days_overdue <= 0) {
             return 0;
        } else if (days_overdue <= 7) {
            return 2 * days_overdue;
        } else if (days_overdue <= 15) {
            return 5 * days_overdue;
        } else {
            int fine = 10 * days_overdue;
            return Math.min(fine, 500);
        }
    }

    @Override
    public String toString() {
        return "Days Overdue : " + (return_date - due_date) + "\n" +
               "Fine Amount  : Rs." + computeFine();
    }
}
