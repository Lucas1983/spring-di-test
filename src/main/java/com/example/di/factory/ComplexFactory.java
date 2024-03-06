package com.example.di.factory;

import com.example.di.model.props.Props;

public abstract class ComplexFactory<T extends Props> implements Factory<T> {}
