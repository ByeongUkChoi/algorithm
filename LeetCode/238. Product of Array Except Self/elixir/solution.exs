defmodule Solution do
  @spec product_except_self(nums :: [integer]) :: [integer]
  def product_except_self(nums) do
    {product, zero_count} =
      Enum.reduce(nums, {1, 0}, fn x, {acc, zero_count} ->
        if x == 0 do
          {acc, zero_count + 1}
        else
          {x * acc, zero_count}
        end
      end)

    Enum.map(nums, &div(product, &1, zero_count))
  end

  defp div(a, b, 0), do: trunc(a / b)
  defp div(a, b, 1), do: if(b == 0, do: a, else: 0)
  defp div(_a, _b, _zero_count), do: 0
end
