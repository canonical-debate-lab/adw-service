# CDL API for ADW

This almost primitive service wraps around [ADW](https://github.com/pilehvar/ADW) to expose a very simple API for checking text similarity of a json request.

## Request

```json
{
  "text1": "We should stop eating meat",
  "text2": "Don't buy so much stuff"
}
```

## Response

```json
{
  "result": 0.507
}
```

## Building

This service is built and deployed in Kotlin using [Bazel](https://bazel.build).

## License

### Code for ADW

The licensing from the original project applies without any changes.

>ADW (Align, Disambiguate and Walk) -- A Unified Approach for Measuring Semantic Similarity.
>
>Copyright (c) 2014 Sapienza University of Rome.
>All Rights Reserved.
>
>This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
>without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
>
>If you use this system, please cite the following paper:
>
>> M. T. Pilehvar, D. Jurgens and R. Navigli. Align, Disambiguate and Walk: A Unified Approach for Measuring Semantic Similarity.
>> Proceedings of the 51st Annual Meeting of the Association for Computational Linguistics (ACL 2013), Sofia, Bulgaria, August 4-9, 2013, pp. 1341-1351.

### Code for wrapping around ADW

The code for wrapping around the ADW implementation is licensed through the same [LICENSE](LICENSE) as the original library.

Thanks to the respective authors and developers for providing their work.
