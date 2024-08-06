package com.programtom.vaadin_bootstrap_components;

/**
 * Represents the autocomplete attribute of different types of input fields.
 */
@SuppressWarnings("unused")
public enum AutoCompleteFieldType {
    /**
     * Autocomplete is on (enabled).
     */
    ON("on"),

    /**
     * Autocomplete is off (disabled).
     */
    OFF("off"),

    /**
     * Will Auto-complete the first line of the street address.
     */
    ADDRESS_LINE1("address-line1"),

    /**
     * Will Auto-complete the second line of the street address.
     */
    ADDRESS_LINE2("address-line2"),

    /**
     * Will Auto-complete the third line of the street address.
     */
    ADDRESS_LINE3("address-line3"),

    /**
     * Will Auto-complete the first level of the address, e.g. the county.
     */
    ADDRESS_LEVEL1("address-level1"),

    /**
     * Will Auto-complete the second level of the address, e.g. the city.
     */
    ADDRESS_LEVEL2("address-level2"),

    /**
     * Will Auto-complete the third level of the address.
     */
    ADDRESS_LEVEL3("address-level3"),

    /**
     * Will Auto-complete the fourth level of the address.
     */
    ADDRESS_LEVEL4("address-level4"),

    /**
     * Will Auto-complete the full street address.
     */
    STREET_ADDRESS("street-address"),

    /**
     * Will Auto-complete the country code.
     */
    COUNTRY("country"),

    /**
     * Will Auto-complete the country name.
     */
    COUNTRY_NAME("country-name"),

    /**
     * Will Auto-complete the post code.
     */
    POSTAL_CODE("postal-code"),

    /**
     * Will Auto-complete the full name.
     */
    NAME("name"),

    /**
     * Will Auto-complete the middle name.
     */
    ADDITIONAL_NAME("additional-name"),

    /**
     * Will Auto-complete the last name.
     */
    FAMILY_NAME("family-name"),

    /**
     * Will Auto-complete the first name.
     */
    GIVEN_NAME("given-name"),

    /**
     * Will Auto-complete the title, like "Mr", "Ms" etc.
     */
    HONORIC_PREFIX("honoric-prefix"),

    /**
     * Will Auto-complete the suffix, like "5", "Jr." etc.
     */
    HONORIC_SUFFIX("honoric-suffix"),

    /**
     * Will Auto-complete the nickname.
     */
    NICKNAME("nickname"),

    /**
     * Will Auto-complete the job title.
     */
    ORGANIZATION_TITLE("organization-title"),

    /**
     * Will Auto-complete the username.
     */
    USERNAME("username"),

    /**
     * Will Auto-complete a new password.
     */
    NEW_PASSWORD("new-password"),

    /**
     * Will Auto-complete the current password.
     */
    CURRENT_PASSWORD("current-password"),

    /**
     * Will Auto-complete the full birthday date.
     */
    BDAY("bday"),

    /**
     * Will Auto-complete the day of the birthday date.
     */
    BDAY_DAY("bday-day"),

    /**
     * Will Auto-complete the month of the birthday date.
     */
    BDAY_MONTH("bday-month"),

    /**
     * Will Auto-complete the year of the birthday date.
     */
    BDAY_YEAR("bday-year"),

    /**
     * Will Auto-complete the gender.
     */
    SEX("sex"),

    /**
     * Will Auto-complete a one time code for verification etc.
     */
    ONE_TIME_CODE("one-time-code"),

    /**
     * Will Auto-complete the company name.
     */
    ORGANIZATION("organization"),

    /**
     * Will Auto-complete the credit card owner's full name.
     */
    CC_NAME("cc-name"),

    /**
     * Will Auto-complete the credit card owner's first name.
     */
    CC_GIVEN_NAME("cc-given-name"),

    /**
     * Will Auto-complete the credit card owner's middle name.
     */
    CC_ADDITIONAL_NAME("cc-additional-name"),

    /**
     * Will Auto-complete the credit card owner's full name.
     */
    CC_FAMILY_NAME("cc-family-name"),

    /**
     * Will Auto-complete the credit card's number.
     */
    CC_NUMBER("cc-number"),

    /**
     * Will Auto-complete the credit card's expiration date.
     */
    CC_EXP("cc-exp"),

    /**
     * Will Auto-complete the credit card's expiration month.
     */
    CC_EXP_MONTH("cc-exp-month"),

    /**
     * Will Auto-complete the credit card's expiration year.
     */
    CC_EXP_YEAR("cc-exp-year"),

    /**
     * Will Auto-complete the CVC code.
     */
    CC_CSC("cc-csc"),

    /**
     * Will Auto-complete the credit card's type of payment.
     */
    CC_TYPE("cc-type"),

    /**
     * Will Auto-complete the currency.
     */
    TRANSACTION_CURRENCY("transaction-currency"),

    /**
     * Will Auto-complete a number, the amount.
     */
    TRANSACTION_AMOUNT("transaction-amount"),

    /**
     * Will Auto-complete the preferred language.
     */
    LANGUAGE("language"),

    /**
     * Will Auto-complete the we address.
     */
    URL("url"),

    /**
     * Will Auto-complete the email address.
     */
    EMAIL("email"),

    /**
     * Will Auto-complete an image.
     */
    PHOTO("photo"),

    /**
     * Will Auto-complete the full phone number.
     */
    TEL("tel"),

    /**
     * Will Auto-complete the country code of the phone number.
     */
    TEL_COUNTRY_CODE("tel-country-code"),

    /**
     * Will Auto-complete the phone number with no country code.
     */
    TEL_NATIONAL("tel-national"),

    /**
     * Will Auto-complete the area code of the phone number.
     */
    TEL_AREA_CODE("tel-area-code"),

    /**
     * Will Auto-complete the phone number with no country code and no area code.
     */
    TEL_LOCAL("tel-local"),

    /**
     * Will Auto-complete the local prefix of the phone number.
     */
    TEL_LOCAL_PREFIX("tel-local-prefix"),

    /**
     * Will Auto-complete the local suffix of the phone number.
     */
    TEL_LOCAL_SUFFIX("tel-local-suffix"),

    /**
     * Will Auto-complete the extension code of the phone number.
     */
    TEL_EXTENSION("tel-extension"),

    /**
     * Will Auto-complete the url of an instant messaging protocol endpoint.
     */
    IMPP("impp");

    private final String htmlValue;

    AutoCompleteFieldType(String htmlValue) {
        this.htmlValue = htmlValue;
    }

    /**
     * Returns the HTML value associated with this address type.
     *
     * @return the HTML value
     */
    public String getHtmlValue() {
        return htmlValue;
    }
}
