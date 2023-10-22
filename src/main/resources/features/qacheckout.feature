Feature: Checkout Web SAUCE DEMO QA
  #TCC.DEMOQA.004
  Scenario: Login & Ceckout Product
    Given User login
    And User click halaman beranda web
    And User click product
    And User click color product
    And User click size product
    And User click add to cart
    And User click view cart
    And User click button ceckout product
    Then User get text billing details

    #TCC.DEMOQA.005