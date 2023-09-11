package dev.mccue.reasonphrase;

import java.util.Map;

/**
 * Provides a lookup from HTTP status code to a recommended reason phrase.
 *
 * <p>
 *     For more details, consult the HTTP RFC document.
 *     <a href="https://www.rfc-editor.org/rfc/rfc9110.html#section-15">https://www.rfc-editor.org/rfc/rfc9110.html#section-15</a>
 * </p>
 */
public final class ReasonPhrase {
    private ReasonPhrase() {}

    private static final Map<Integer, String> STATUS_TO_REASON = Map.ofEntries(
            Map.entry(100, "Continue"),
            Map.entry(101, "Switching Protocols"),
            Map.entry(200, "OK"),
            Map.entry(201, "Created"),
            Map.entry(202, "Accepted"),
            Map.entry(203, "Non-Authoritative Information"),
            Map.entry(204, "No Content"),
            Map.entry(205, "Reset Content"),
            Map.entry(206, "Partial Content"),
            Map.entry(300, "Multiple Choices"),
            Map.entry(301, "Moved Permanently"),
            Map.entry(302, "Found"),
            Map.entry(303, "See Other"),
            Map.entry(304, "Not Modified"),
            Map.entry(305, "Use Proxy"),
            Map.entry(307, "Temporary Redirect"),
            Map.entry(400, "Bad Request"),
            Map.entry(401, "Unauthorized"),
            Map.entry(402, "Payment Required"),
            Map.entry(403, "Forbidden"),
            Map.entry(404, "Not Found"),
            Map.entry(405, "Method Not Allowed"),
            Map.entry(406, "Not Acceptable"),
            Map.entry(407, "Proxy Authentication Required"),
            Map.entry(408, "Request Time-out"),
            Map.entry(409, "Conflict"),
            Map.entry(410, "Gone"),
            Map.entry(411, "Length Required"),
            Map.entry(412, "Precondition Failed"),
            Map.entry(413, "Request Entity Too Large"),
            Map.entry(414, "Request-URI Too Large"),
            Map.entry(415, "Unsupported Media Type"),
            Map.entry(416, "Requested range not satisfiable"),
            Map.entry(417, "Expectation Failed"),
            Map.entry(500, "Internal Server Error"),
            Map.entry(501, "Not Implemented"),
            Map.entry(502, "Bad Gateway"),
            Map.entry(503, "Service Unavailable"),
            Map.entry(504, "Gateway Time-out"),
            Map.entry(505, "HTTP Version not supported")
    );

    /**
     * Looks up a known reason phrase for the status, defaulting
     * to "Unknown."
     *
     * @param status The http status code.
     * @return The associated reason phrase or "Unknown" if none found.
     */
    public static String forStatus(int status) {
        return forStatus(status, "Unknown");
    }

    /**
     * Looks up a known reason phrase for the status, defaulting
     * to the provided fallback.
     *
     * @param status The http status code.
     * @param fallback The fallback value to use.
     * @return The associated reason phrase or the fallback if none found.
     */
    public static String forStatus(int status, String fallback) {
        return STATUS_TO_REASON.getOrDefault(status, fallback);
    }
}
