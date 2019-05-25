package currencyConverter;

public class CurrencyConverter {
    private double thb = 1; //Thai Baht
    private double usd = 0.031; //US Dollar
    private double cny = 0.22; //Chinese Yuan
    private double jpy = 3.44; //Japanese Yen
    private double krw = 37.24; //Korean Won
    private double hkd = 0.25; //Hong Kong Dollar

    private static CurrencyConverter currencyInstance;
    private String[] unit = {"USD: US Dollar", "CNY: Chinese Yuan", "JPY: Japanese Yen", "KRW: Korean Won", "HKD: Hong Kong Dollar"};

    private CurrencyConverter(){}

    public static synchronized CurrencyConverter getCurrencyInstance(){
        if(currencyInstance == null){
            currencyInstance = new CurrencyConverter();
        }
        return currencyInstance;
    }

    public double convertCurrency(double amount, String currency){
        double value;
        if(currency.equals("USD: US Dollar")) value = amount * (thb * usd);
        else if(currency.equals("CNY: Chinese Yuan")) value = amount * (thb * cny);
        else if(currency.equals("JPY: Japanese Yen")) value = amount * (thb * jpy);
        else if(currency.equals("KRW: Korean Won")) value = amount * (thb * krw);
        else if(currency.equals("HKD: Hong Kong Dollar")) value = amount * (thb * hkd);
        else value = amount;

        return value;
    };

    public String[] getUnits(){
        return this.unit;
    }

}
