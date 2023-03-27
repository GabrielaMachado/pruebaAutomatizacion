#language: en
  Feature: Make an appointment on the CURA website

    Scenario:
      Given the actor is on the CURA website
      When the actor is log in and completes the appointment form
      Then the actor sees the appointment confirmation

