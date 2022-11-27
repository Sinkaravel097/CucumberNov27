$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/01FacebookNew.feature");
formatter.feature({
  "name": "To validate the login functionality in fb application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To validate with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to launch the fb application in browser",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookTask.user_has_to_launch_the_fb_application_in_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass invalid username in email field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookTask.user_has_to_pass_invalid_username_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass invalid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookTask.user_has_to_pass_invalid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookTask.user_has_to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate the positive and negative combination in login field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario2"
    },
    {
      "name": "@Scenario50"
    }
  ]
});
formatter.step({
  "name": "User has the launch the url",
  "keyword": "When "
});
formatter.step({
  "name": "To pass the bulk of \"\u003cemailfield\u003e\" datas to email field",
  "keyword": "And "
});
formatter.step({
  "name": "To pass the bulk of datas to password \"\u003cpassfield\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailfield",
        "passfield"
      ]
    },
    {
      "cells": [
        "selenium@gmail.com",
        "sel@123"
      ]
    },
    {
      "cells": [
        "java@gmail.com",
        "java@123"
      ]
    },
    {
      "cells": [
        "python@gmail.com",
        "python@123"
      ]
    },
    {
      "cells": [
        "sql@gmail.com",
        "sql@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the positive and negative combination in login field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario2"
    },
    {
      "name": "@Scenario50"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has the launch the url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_the_launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the bulk of \"selenium@gmail.com\" datas to email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_bulk_of_datas_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the bulk of datas to password \"sel@123\" field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_bulk_of_datas_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination in login field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario2"
    },
    {
      "name": "@Scenario50"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has the launch the url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_the_launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the bulk of \"java@gmail.com\" datas to email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_bulk_of_datas_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the bulk of datas to password \"java@123\" field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_bulk_of_datas_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination in login field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario2"
    },
    {
      "name": "@Scenario50"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has the launch the url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_the_launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the bulk of \"python@gmail.com\" datas to email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_bulk_of_datas_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the bulk of datas to password \"python@123\" field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_bulk_of_datas_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination in login field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario2"
    },
    {
      "name": "@Scenario50"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has the launch the url",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegative.user_has_the_launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the bulk of \"sql@gmail.com\" datas to email field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_bulk_of_datas_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the bulk of datas to password \"sql@123\" field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_pass_the_bulk_of_datas_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegative.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/02Amazon.feature");
formatter.feature({
  "name": "To validate the login functionality of amazon application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To validate login with valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the amz application",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonTask.to_launch_the_amz_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid username in email field",
  "rows": [
    {
      "cells": [
        "emailone",
        "sql@gmail.com"
      ]
    },
    {
      "cells": [
        "emailtwo",
        "python@gmail.com"
      ]
    },
    {
      "cells": [
        "emailthree",
        "java@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AmazonTask.to_pass_valid_username_in_email_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonTask.to_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter the invalid password in password field",
  "rows": [
    {
      "cells": [
        "passone",
        "passtwo",
        "passthree"
      ]
    },
    {
      "cells": [
        "sql@123",
        "python@123",
        "java@123"
      ]
    },
    {
      "cells": [
        "5687654",
        "cucumber@123",
        "9764567"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AmazonTask.to_enter_the_invalid_password_in_password_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonTask.toClickTheSigninButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});