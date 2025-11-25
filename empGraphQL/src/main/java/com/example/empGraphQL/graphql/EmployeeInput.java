package com.example.empGraphQL.graphql;

public record EmployeeInput (
    String name,
    int age,
    String job,
    String language, // String은 immutable이라서 얘를 바꿀 수 있는 함수가 필요한데 이게 replace임.
    int pay
) {}
