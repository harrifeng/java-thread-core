package org.hfeng.ch02.example01;

import org.hfeng.ch02.CircularSeqGenerator;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class RequestIDGenerator implements CircularSeqGenerator {

    private final static RequestIDGenerator INSTANCE = new RequestIDGenerator();
    private final static short SEQ_UPPER_LIMIT = 9999;
    private short sequence = -1;

    private RequestIDGenerator() {
    }

    @Override
    public short nextSequence() {
        if (sequence >= SEQ_UPPER_LIMIT) {
            sequence = 0;
        } else {
            sequence ++;
        }
        return sequence;
    }

    public String nextID() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        String timestamp = sdf.format(new Date());
        DecimalFormat df = new DecimalFormat("0000");

        short sequenceNo = nextSequence();
        return "0049" + timestamp + df.format(sequenceNo);
    }

    public static RequestIDGenerator getInstance() {
        return INSTANCE;
    }
}
