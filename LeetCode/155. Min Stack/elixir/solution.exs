defmodule MinStack do
  @table :min_stack_table
  @key :min_stack_key

  @spec init_() :: any
  def init_() do
    if :ets.whereis(@table) == :undefined do
      :ets.new(@table, [:private, :named_table])
    end

    :ets.insert(@table, {@key, %{stack: [], min: nil}})
  end

  @spec push(val :: integer) :: any
  def push(val) do
    [{_, %{stack: stack, min: min}}] = :ets.lookup(@table, @key)
    new_min = if min, do: min(min, val), else: val
    :ets.insert(@table, {@key, %{stack: [val | stack], min: new_min}})
  end

  @spec pop() :: any
  def pop() do
    [{_, %{stack: [h | t], min: min}}] = :ets.lookup(@table, @key)

    new_min =
      cond do
        t == [] -> nil
        min == h -> Enum.min(t)
        true -> min
      end

    :ets.insert(@table, {@key, %{stack: t, min: new_min}})
    h
  end

  @spec top() :: integer
  def top() do
    [{_, %{stack: stack}}] = :ets.lookup(@table, @key)

    case stack do
      [h | _] -> h
      [] -> nil
    end
  end

  @spec get_min() :: integer
  def get_min() do
    [{_, %{min: min}}] = :ets.lookup(@table, @key)
    min
  end
end

# Your functions will be called as such:
# MinStack.init_()
# MinStack.push(val)
# MinStack.pop()
# param_3 = MinStack.top()
# param_4 = MinStack.get_min()

# MinStack.init_ will be called before every test case, in which you can do some necessary initializations.
