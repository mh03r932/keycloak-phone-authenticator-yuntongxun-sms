package com.hfx.keycloak;

import okhttp3.Response;

import java.util.Map;

public class YunTongXun {
    public SMSMock sms() {
        return new SMSMock();
    }

    public  static class SMSMock {
        public void sendSMS(String templateId, String phoneNumber, Map<String, ? super Object> params) {
            System.out.println("templateId = " + templateId + ", phoneNumber = " + phoneNumber + ", params = " + params);
            Response.Builder builder = new Response.Builder();


        }
    }
}
