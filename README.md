# Spring Send SMS
Simple send SMS with Spring Boot

## Featured
- Spring Web
- Twilio
- Send SMS from Rest API

## How to use
### Setting SID
- SendMessage.twilio.account.sid=... -> on src/main/resources/application.properties with Account SID Twilio

### Setting Auth Token
- SendMessage.twilio.account.authtoken=... -> on src/main/resources/application.properties with Auth Token from Twilio

### Setting Phone Number
- SendMessage.numberPhone=... -> on src/main/resources/application.properties with phone number from Twilio or registered

## API
Methods | Url | Action |
--- | --- | --- |
| GET | /api/phone/{phoneNumber}/verification | send message on phone number |
