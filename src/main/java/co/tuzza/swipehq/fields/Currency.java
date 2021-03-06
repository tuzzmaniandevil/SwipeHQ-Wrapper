/*
 * Copyright 2016 Tuzza.co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package co.tuzza.swipehq.fields;

/**
 * These are the current currencies that the SwipeHQ system supports.
 *
 * @author Wesley
 */
public enum Currency {

    AustralianDollars("Australian dollars", "AUD"),
    CanadianDollars("Canadian dollars", "CAD"),
    ChineseYuan("Chinese yuan", "CNY"),
    Euros("Euros", "EUR"),
    GreatBritishPounds("Great British pounds", "GBP"),
    HongKongDollars("Hong Kong dollars", "HKD"),
    JapaneseYen("Japanese yen", "JPY"),
    NewZealandDollars("New Zealand dollars", "NZD"),
    SingaporeanDollars("Singaporean dollars", "SGD"),
    SouthAfricanRand("South African rand", "ZAR"),
    SouthKoreanWon("South Korean won", "KRW"),
    UnitedStatesDollars("United States dollars", "USD");

    private final String name;
    private final String symbol;

    private Currency(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Currency findByName(String n) {
        for (Currency v : Currency.values()) {
            if (v.name.equalsIgnoreCase(n)) {
                return v;
            }
        }

        return null;
    }

    public static Currency findBySymbol(String n) {
        for (Currency v : Currency.values()) {
            if (v.symbol.equalsIgnoreCase(n)) {
                return v;
            }
        }

        return null;
    }

    public static Currency findByAny(String n) {
        Currency c = findByName(n);

        if (c == null) {
            c = findBySymbol(n);
        }

        return c;
    }

    @Override
    public String toString() {
        return name;
    }
}
