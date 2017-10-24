package com.example.trybook;

import java.io.InputStream;

public interface ArgumentResolver {
    Argument resolve(InputStream stream);
}
