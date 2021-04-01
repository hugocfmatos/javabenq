package org.academiadecodigo.javabank.command;

import org.academiadecodigo.javabank.persistence.model.Customer;

import javax.validation.constraints.*;

/**
 * The {@link Customer} data transfer object
 */
public class CustomerDto {

    private Integer id;

    @NotNull(message = "first name is mandatory")
    @NotBlank(message = "first name is mandatory")
    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Only characters allowed")
    @Size(min=3, max=64)
    private String firstName;

    @NotNull(message = "last name is mandatory")
    @NotBlank(message = "last name is mandatory")
    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Only characters allowed")
    @Size(min=3, max=64)
    private String lastName;

    @Email
    @Pattern(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", message = "invalid email")
    private String email;

    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", message = "invalid phone number")
    @Size(min=9, max=16)
    private String phone;

    /**
     * Gets the id of the customer dto
     *
     * @return the customer dto id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id of the customer dto
     *
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the first name of the customer dto
     *
     * @return the customer dto first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the customer dto
     *
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the customer dto
     *
     * @return the customer dto last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the customer dto
     *
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the email of the customer dto
     *
     * @return the customer dto email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the customer dto email
     *
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the phone of the customer dto
     *
     * @return the customer dto phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the customer dto phone
     *
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
