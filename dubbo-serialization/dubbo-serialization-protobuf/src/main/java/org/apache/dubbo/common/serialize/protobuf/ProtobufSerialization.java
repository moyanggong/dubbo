package org.apache.dubbo.common.serialize.protobuf;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.serialize.ObjectInput;
import org.apache.dubbo.common.serialize.ObjectOutput;
import org.apache.dubbo.common.serialize.Serialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static org.apache.dubbo.common.serialize.Constants.PROTOBUF_SERIALIZATION;

public class ProtobufSerialization implements Serialization {
    @Override
    public byte getContentTypeId() {
        return PROTOBUF_SERIALIZATION;
    }

    @Override
    public String getContentType() {
        return "protobuf/binary";
    }

    @Override
    public ObjectOutput serialize(URL url, OutputStream output) throws IOException {
        return new ProtobufObjectOutput();
    }

    @Override
    public ObjectInput deserialize(URL url, InputStream input) throws IOException {
        return new ProtobufObjectInput();
    }
}
