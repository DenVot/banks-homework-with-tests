package org.denvot.banks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
  @Test
  public void createClient() {
    Bank bank = new Bank();
    bank.createClient(new Client("Test", "Test", "123"));
    assertTrue(bank.getClient("123").isPresent());
  }

  @Test
  public void clientMustBeNull() {
    Bank bank = new Bank();

    assertFalse(bank.getClient("123").isPresent());
  }

  @Test
  public void deleteClientShouldDelete() {
    Bank bank = new Bank();
    bank.createClient(new Client("Test", "Test", "123"));
    assertTrue(bank.deleteClient("123"));
  }

  @Test
  public void deleteClientShouldNotDelete() {
    Bank bank = new Bank();
    assertFalse(bank.deleteClient("123"));
  }
}