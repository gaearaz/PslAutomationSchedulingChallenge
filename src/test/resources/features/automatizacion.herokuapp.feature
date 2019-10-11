Feature: Add User Testing
  Scenario: Create Doctor & Patient
    Given an customized url in the application
    When he input your data to register a doctor or Patient
    And he clicks in 'Guardar' Button
    Then the user should be created