
    public class TipCalculator {
            private int numberofPeople;
            private int tipPercentage;
            private double billBeforetip;

        public TipCalculator( int numberofPeople, int tipPercentage)
            {
                this.numberofPeople = numberofPeople;
                this.tipPercentage = tipPercentage;
                billBeforetip = 0.0;
            }

            public double getBillBeforetip () {
                return billBeforetip;
            }

            public int getTipPercentage () {
                return tipPercentage;
            }

            public void addMeal ( double itemCost){
                billBeforetip = billBeforetip + itemCost;
            }

            public double tipAmount () {
                return billBeforetip * ((double) tipPercentage / 100);
            }

            public double totalBill () {
                return tipAmount() + billBeforetip;
            }

            public double perpersonBeforetip () {
                return billBeforetip / numberofPeople;
            }

            public double perpersontipAmount () {
                return tipAmount() / numberofPeople;
            }

            public double perpersonTotal () {
                return totalBill() / numberofPeople;
            }
        }



