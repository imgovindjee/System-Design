package com.XX.LLD.PRACTICE.StatePattern.DesignATM;

public enum TransactionType {
    CASH_WITHDRAWAL,
    BALANCE_CHECK;

    public static void showAllTransactionTypes(){
        System.out.println("-----------------------------------------------------------------------------------------" +
                "\nAvailable Transaction Type: ");
        for(TransactionType t_types: TransactionType.values()){
            System.out.println(t_types);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
