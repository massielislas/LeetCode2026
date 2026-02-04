# LeetCode Project Instructions

## Project Structure

- **Solution files**: `src/main/java/org/solutions/`
- **Test files**: `src/test/java/org/solutions/`
- **Adapter/Directory**: `src/main/java/org/adapter/`

## Creating a New Solution

1. Create a solution class in `src/main/java/org/solutions/<SolutionName>.java`
2. Create a corresponding test class in `src/test/java/org/solutions/<SolutionName>Test.java`

### Solution File Template

```java
package org.solutions;

public class SolutionName {
    // Add solution method here
}
```

### Test File Template

```java
package org.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionNameTest {

    private SolutionName solutionName;

    @BeforeEach
    void setUp() {
        solutionName = new SolutionName();
    }

    @Test
    void testMethodName_description() {
        // Arrange
        // Act
        // Assert
    }
}
```

## Current Solutions

| Solution | Description |
|----------|-------------|
| TwoSum | Find indices of two numbers that add up to target |
| ReverseWords | Reverse the order of words in a string |
| MergeStringsAlternately | Merge two strings by alternating characters |

## LeetCodeDirectory

The `LeetCodeDirectory` class in `src/main/java/org/adapter/` serves as a central directory for solutions. Add new solution instances to its constructor as needed.
