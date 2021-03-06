/*
 * This file is generated by jOOQ.
*/
package com.springboot.sources.tables.records;


import com.springboot.sources.tables.User;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record7<UInteger, String, String, Integer, Timestamp, Timestamp, Boolean> {

    private static final long serialVersionUID = 210838163;

    /**
     * Setter for <code>jooq.user.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq.user.id</code>.
     */
    @NotNull
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>jooq.user.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq.user.first_name</code>.
     */
    @NotNull
    @Size(max = 32)
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jooq.user.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq.user.last_name</code>.
     */
    @NotNull
    @Size(max = 32)
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jooq.user.age</code>.
     */
    public void setAge(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>jooq.user.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>jooq.user.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>jooq.user.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>jooq.user.updated_at</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>jooq.user.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>jooq.user.is_active</code>.
     */
    public void setIsActive(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>jooq.user.is_active</code>.
     */
    public Boolean getIsActive() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UInteger, String, String, Integer, Timestamp, Timestamp, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UInteger, String, String, Integer, Timestamp, Timestamp, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return User.USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return User.USER.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return User.USER.AGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return User.USER.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return User.USER.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return User.USER.IS_ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(Integer value) {
        setAge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value5(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value6(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value7(Boolean value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(UInteger value1, String value2, String value3, Integer value4, Timestamp value5, Timestamp value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(UInteger id, String firstName, String lastName, Integer age, Timestamp createdAt, Timestamp updatedAt, Boolean isActive) {
        super(User.USER);

        set(0, id);
        set(1, firstName);
        set(2, lastName);
        set(3, age);
        set(4, createdAt);
        set(5, updatedAt);
        set(6, isActive);
    }
}
