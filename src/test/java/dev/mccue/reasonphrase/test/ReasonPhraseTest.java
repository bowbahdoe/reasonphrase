package dev.mccue.reasonphrase.test;

import dev.mccue.reasonphrase.ReasonPhrase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReasonPhraseTest {
    @Test
    public void testDefault() {
        assertEquals(ReasonPhrase.forStatus(-5), "Unknown");
    }

    @Test
    public void testProvidedFallback() {
        assertEquals(ReasonPhrase.forStatus(-5, "other"), "other");
    }

    @Test
    public void test100() {
        assertEquals(ReasonPhrase.forStatus(100), "Continue");
        assertEquals(ReasonPhrase.forStatus(100, "fallback"), "Continue");
    }

    @Test
    public void test101() {
        assertEquals(ReasonPhrase.forStatus(101), "Switching Protocols");
        assertEquals(ReasonPhrase.forStatus(101, "fallback"), "Switching Protocols");
    }

    @Test
    public void test102() {
        assertEquals(ReasonPhrase.forStatus(102), "Processing");
        assertEquals(ReasonPhrase.forStatus(102, "fallback"), "Processing");
    }

    @Test
    public void test103() {
        assertEquals(ReasonPhrase.forStatus(103), "Early Hints");
        assertEquals(ReasonPhrase.forStatus(103, "fallback"), "Early Hints");
    }

    @Test
    public void test200() {
        assertEquals(ReasonPhrase.forStatus(200), "OK");
        assertEquals(ReasonPhrase.forStatus(200, "fallback"), "OK");
    }

    @Test
    public void test201() {
        assertEquals(ReasonPhrase.forStatus(201), "Created");
        assertEquals(ReasonPhrase.forStatus(201, "fallback"), "Created");
    }


    @Test
    public void test202() {
        assertEquals(ReasonPhrase.forStatus(202), "Accepted");
        assertEquals(ReasonPhrase.forStatus(202, "fallback"), "Accepted");
    }

    @Test
    public void test203() {
        assertEquals(ReasonPhrase.forStatus(203), "Non-Authoritative Information");
        assertEquals(ReasonPhrase.forStatus(203, "fallback"), "Non-Authoritative Information");
    }

    @Test
    public void test204() {
        assertEquals(ReasonPhrase.forStatus(204), "No Content");
        assertEquals(ReasonPhrase.forStatus(204, "fallback"), "No Content");
    }

    @Test
    public void test205() {
        assertEquals(ReasonPhrase.forStatus(205), "Reset Content");
        assertEquals(ReasonPhrase.forStatus(205, "fallback"), "Reset Content");
    }

    @Test
    public void test206() {
        assertEquals(ReasonPhrase.forStatus(206), "Partial Content");
        assertEquals(ReasonPhrase.forStatus(206, "fallback"), "Partial Content");
    }

    @Test
    public void test207() {
        assertEquals(ReasonPhrase.forStatus(207), "Multi-Status");
        assertEquals(ReasonPhrase.forStatus(207, "fallback"), "Multi-Status");
    }

    @Test
    public void test208() {
        assertEquals(ReasonPhrase.forStatus(208), "Already Reported");
        assertEquals(ReasonPhrase.forStatus(208, "fallback"), "Already Reported");
    }

    @Test
    public void test226() {
        assertEquals(ReasonPhrase.forStatus(226), "IM Used");
        assertEquals(ReasonPhrase.forStatus(226, "fallback"), "IM Used");
    }

    @Test
    public void test300() {
        assertEquals(ReasonPhrase.forStatus(300), "Multiple Choices");
        assertEquals(ReasonPhrase.forStatus(300, "fallback"), "Multiple Choices");
    }

    @Test
    public void test301() {
        assertEquals(ReasonPhrase.forStatus(301), "Moved Permanently");
        assertEquals(ReasonPhrase.forStatus(301, "fallback"), "Moved Permanently");
    }

    @Test
    public void test302() {
        assertEquals(ReasonPhrase.forStatus(302), "Found");
        assertEquals(ReasonPhrase.forStatus(302, "fallback"), "Found");
    }

    @Test
    public void test303() {
        assertEquals(ReasonPhrase.forStatus(303), "See Other");
        assertEquals(ReasonPhrase.forStatus(303, "fallback"), "See Other");
    }


    @Test
    public void test304() {
        assertEquals(ReasonPhrase.forStatus(304), "Not Modified");
        assertEquals(ReasonPhrase.forStatus(304, "fallback"), "Not Modified");
    }

    @Test
    public void test305() {
        assertEquals(ReasonPhrase.forStatus(305), "Use Proxy");
        assertEquals(ReasonPhrase.forStatus(305, "fallback"), "Use Proxy");
    }

    @Test
    public void test307() {
        assertEquals(ReasonPhrase.forStatus(307), "Temporary Redirect");
        assertEquals(ReasonPhrase.forStatus(307, "fallback"), "Temporary Redirect");
    }

    @Test
    public void test308() {
        assertEquals(ReasonPhrase.forStatus(308), "Permanent Redirect");
        assertEquals(ReasonPhrase.forStatus(308, "fallback"), "Permanent Redirect");
    }

    @Test
    public void test400() {
        assertEquals(ReasonPhrase.forStatus(400), "Bad Request");
        assertEquals(ReasonPhrase.forStatus(400, "fallback"), "Bad Request");
    }

    @Test
    public void test401() {
        assertEquals(ReasonPhrase.forStatus(401), "Unauthorized");
        assertEquals(ReasonPhrase.forStatus(401, "fallback"), "Unauthorized");
    }

    @Test
    public void test402() {
        assertEquals(ReasonPhrase.forStatus(402), "Payment Required");
        assertEquals(ReasonPhrase.forStatus(402, "fallback"), "Payment Required");
    }

    @Test
    public void test403() {
        assertEquals(ReasonPhrase.forStatus(403), "Forbidden");
        assertEquals(ReasonPhrase.forStatus(403, "fallback"), "Forbidden");
    }

    @Test
    public void test404() {
        assertEquals(ReasonPhrase.forStatus(404), "Not Found");
        assertEquals(ReasonPhrase.forStatus(404, "fallback"), "Not Found");
    }

    @Test
    public void test405() {
        assertEquals(ReasonPhrase.forStatus(405), "Method Not Allowed");
        assertEquals(ReasonPhrase.forStatus(405, "fallback"), "Method Not Allowed");
    }

    @Test
    public void test406() {
        assertEquals(ReasonPhrase.forStatus(406), "Not Acceptable");
        assertEquals(ReasonPhrase.forStatus(406, "fallback"), "Not Acceptable");
    }

    @Test
    public void test407() {
        assertEquals(ReasonPhrase.forStatus(407), "Proxy Authentication Required");
        assertEquals(ReasonPhrase.forStatus(407, "fallback"), "Proxy Authentication Required");
    }

    @Test
    public void test408() {
        assertEquals(ReasonPhrase.forStatus(408), "Request Time-out");
        assertEquals(ReasonPhrase.forStatus(408, "fallback"), "Request Time-out");
    }

    @Test
    public void test409() {
        assertEquals(ReasonPhrase.forStatus(409), "Conflict");
        assertEquals(ReasonPhrase.forStatus(409, "fallback"), "Conflict");
    }

    @Test
    public void test410() {
        assertEquals(ReasonPhrase.forStatus(410), "Gone");
        assertEquals(ReasonPhrase.forStatus(410, "fallback"), "Gone");
    }

    @Test
    public void test411() {
        assertEquals(ReasonPhrase.forStatus(411), "Length Required");
        assertEquals(ReasonPhrase.forStatus(411, "fallback"), "Length Required");
    }

    @Test
    public void test412() {
        assertEquals(ReasonPhrase.forStatus(412), "Precondition Failed");
        assertEquals(ReasonPhrase.forStatus(412, "fallback"), "Precondition Failed");
    }

    @Test
    public void test413() {
        assertEquals(ReasonPhrase.forStatus(413), "Request Entity Too Large");
        assertEquals(ReasonPhrase.forStatus(413, "fallback"), "Request Entity Too Large");
    }


    @Test
    public void test414() {
        assertEquals(ReasonPhrase.forStatus(414), "Request-URI Too Large");
        assertEquals(ReasonPhrase.forStatus(414, "fallback"), "Request-URI Too Large");
    }

    @Test
    public void test415() {
        assertEquals(ReasonPhrase.forStatus(415), "Unsupported Media Type");
        assertEquals(ReasonPhrase.forStatus(415, "fallback"), "Unsupported Media Type");
    }

    @Test
    public void test416() {
        assertEquals(ReasonPhrase.forStatus(416), "Requested range not satisfiable");
        assertEquals(ReasonPhrase.forStatus(416, "fallback"), "Requested range not satisfiable");
    }

    @Test
    public void test417() {
        assertEquals(ReasonPhrase.forStatus(417), "Expectation Failed");
        assertEquals(ReasonPhrase.forStatus(417, "fallback"), "Expectation Failed");
    }

    @Test
    public void test418() {
        assertEquals(ReasonPhrase.forStatus(418), "I'm a teapot");
        assertEquals(ReasonPhrase.forStatus(418, "fallback"), "I'm a teapot");
    }

    @Test
    public void test421() {
        assertEquals(ReasonPhrase.forStatus(421), "Misdirected Request");
        assertEquals(ReasonPhrase.forStatus(421, "fallback"), "Misdirected Request");
    }

    @Test
    public void test422() {
        assertEquals(ReasonPhrase.forStatus(422), "Unprocessable Content");
        assertEquals(ReasonPhrase.forStatus(422, "fallback"), "Unprocessable Content");
    }

    @Test
    public void test423() {
        assertEquals(ReasonPhrase.forStatus(423), "Locked");
        assertEquals(ReasonPhrase.forStatus(423, "fallback"), "Locked");
    }

    @Test
    public void test424() {
        assertEquals(ReasonPhrase.forStatus(424), "Failed Dependency");
        assertEquals(ReasonPhrase.forStatus(424, "fallback"), "Failed Dependency");
    }

    @Test
    public void test425() {
        assertEquals(ReasonPhrase.forStatus(425), "Too Early");
        assertEquals(ReasonPhrase.forStatus(425, "fallback"), "Too Early");
    }

    @Test
    public void test426() {
        assertEquals(ReasonPhrase.forStatus(426), "Upgrade Required");
        assertEquals(ReasonPhrase.forStatus(426, "fallback"), "Upgrade Required");
    }

    @Test
    public void test428() {
        assertEquals(ReasonPhrase.forStatus(428), "Precondition Required");
        assertEquals(ReasonPhrase.forStatus(428, "fallback"), "Precondition Required");
    }

    @Test
    public void test429() {
        assertEquals(ReasonPhrase.forStatus(429), "Too Many Requests");
        assertEquals(ReasonPhrase.forStatus(429, "fallback"), "Too Many Requests");
    }

    @Test
    public void test431() {
        assertEquals(ReasonPhrase.forStatus(431), "Request Header Fields Too Large");
        assertEquals(ReasonPhrase.forStatus(431, "fallback"), "Request Header Fields Too Large");
    }

    @Test
    public void test451() {
        assertEquals(ReasonPhrase.forStatus(451), "Unavailable For Legal Reasons");
        assertEquals(ReasonPhrase.forStatus(451, "fallback"), "Unavailable For Legal Reasons");
    }

    @Test
    public void test500() {
        assertEquals(ReasonPhrase.forStatus(500), "Internal Server Error");
        assertEquals(ReasonPhrase.forStatus(500, "fallback"), "Internal Server Error");
    }

    @Test
    public void test501() {
        assertEquals(ReasonPhrase.forStatus(501), "Not Implemented");
        assertEquals(ReasonPhrase.forStatus(501, "fallback"), "Not Implemented");
    }

    @Test
    public void test502() {
        assertEquals(ReasonPhrase.forStatus(502), "Bad Gateway");
        assertEquals(ReasonPhrase.forStatus(502, "fallback"), "Bad Gateway");
    }

    @Test
    public void test503() {
        assertEquals(ReasonPhrase.forStatus(503), "Service Unavailable");
        assertEquals(ReasonPhrase.forStatus(503, "fallback"), "Service Unavailable");
    }

    @Test
    public void test504() {
        assertEquals(ReasonPhrase.forStatus(504), "Gateway Time-out");
        assertEquals(ReasonPhrase.forStatus(504, "fallback"), "Gateway Time-out");
    }

    @Test
    public void test505() {
        assertEquals(ReasonPhrase.forStatus(505), "HTTP Version not supported");
        assertEquals(ReasonPhrase.forStatus(505, "fallback"), "HTTP Version not supported");
    }

    @Test
    public void test506() {
        assertEquals(ReasonPhrase.forStatus(506), "Variant Also Negotiates");
        assertEquals(ReasonPhrase.forStatus(506, "fallback"), "Variant Also Negotiates");
    }

    @Test
    public void test507() {
        assertEquals(ReasonPhrase.forStatus(507), "Insufficient Storage");
        assertEquals(ReasonPhrase.forStatus(507, "fallback"), "Insufficient Storage");
    }

    @Test
    public void test508() {
        assertEquals(ReasonPhrase.forStatus(508), "Loop Detected");
        assertEquals(ReasonPhrase.forStatus(508, "fallback"), "Loop Detected");
    }

    @Test
    public void test510() {
        assertEquals(ReasonPhrase.forStatus(510),  "Not Extended");
        assertEquals(ReasonPhrase.forStatus(510, "fallback"),  "Not Extended");
    }

    @Test
    public void test511() {
        assertEquals(ReasonPhrase.forStatus(511), "Network Authentication Required");
        assertEquals(ReasonPhrase.forStatus(511, "fallback"), "Network Authentication Required");
    }



}
