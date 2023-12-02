package org.denvot.banks;

public class CurrenciesConverter {
    public static double ConvertFromOriginalToTarget(double value,
                                                     Currency original,
                                                     Currency target) {
        return target.convertFromCommon(original.convertToCommon(value));
    }
}
